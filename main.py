from antlr4 import *
from gen.SASLexer import SASLexer
from gen.SASParser import SASParser

with open('./test01.sas','r',encoding='utf-8') as f:
    input_text=f.read()

lexer = SASLexer(InputStream(input_text))
stream = CommonTokenStream(lexer)
parser = SASParser(stream)

tree = parser.parse()

print(tree.toStringTree(recog=parser))
