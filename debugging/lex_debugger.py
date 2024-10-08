import pandas as pd

from auxilary import token_dictionary #,token_info
from antlr4 import *

from debugging.auxilary import token_info
from gen.SASLexer import SASLexer
from gen.SASParser import SASParser
lexer_df=pd.DataFrame(columns=['type','value','code_loc'])
project_loc= r'/home/pooja/PycharmProjects/sas-grammar///'
sas_code_loc= project_loc + '//sas_codes///data_step.sas'
token_dict=token_dictionary(project_loc + '//gen//SAS.tokens')
with open(sas_code_loc, 'r', encoding='utf-8') as f:
    input_text=f.read()

lexer = SASLexer(InputStream(input_text))
stream = CommonTokenStream(lexer)


if 0:#lexer debugger
    while (True) :
          token = lexer.nextToken()
          lexer_df=token_info(lexer_df,token,sas_code_loc)
          print(token)
          if (token.type==-1 ) :break


    lexer_df['token_identifier']=lexer_df['type'].map(lambda x:token_dict[x])

    lexer_df.sort_values(['type']).to_csv(project_loc+'//debugging//lexers.csv')
if 1:
    parser = SASParser(stream)

    tree = parser.parse()
    print(tree.toStringTree(recog=parser))
