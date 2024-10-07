import pandas as pd
from antlr4.Token import CommonToken
import warnings




def token_dictionary(loc:str)->dict:
    """
    outputs tokens file dictionary
    :param loc:
    :return:
    """
    output_dict={}
    with open (loc,'r',encoding='utf-8') as f:
        lines=f.readlines()
    for l in lines:
        clean_l=l.strip()
        if "=" in clean_l:
            splitted=clean_l.split("=")
            key,value=splitted[0],splitted[1]
            try:
                output_dict[int(value)]=key
            except:
                warnings.warn("token_dict: not added {} {}".format(key,value))
    return output_dict
def token_info(df:pd.DataFrame,token:CommonToken,code_loc:str)->pd.DataFrame:
    """
    updates dataframe for a token and returns
    :param df:columns: type,value,code
    :param token:
    :return:
    """
    token_df=pd.DataFrame([{'type':token.type,'value':token.text,'code':code_loc}])
    if token.type==-1:
        warnings.warn("token_info: not added {}".format(token.text))
        return df
    return pd.concat([df,token_df],axis=0)