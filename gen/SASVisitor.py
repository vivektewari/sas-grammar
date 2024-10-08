# Generated from /home/pooja/PycharmProjects/sas-grammar/SAS.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .SASParser import SASParser
else:
    from SASParser import SASParser

	package org.opensas01.antlr4;


# This class defines a complete generic visitor for a parse tree produced by SASParser.

class SASVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SASParser#parse.
    def visitParse(self, ctx:SASParser.ParseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#sas_stmt_block.
    def visitSas_stmt_block(self, ctx:SASParser.Sas_stmt_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#data_stmt_block.
    def visitData_stmt_block(self, ctx:SASParser.Data_stmt_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#data_stmt_list.
    def visitData_stmt_list(self, ctx:SASParser.Data_stmt_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#infile_stmt.
    def visitInfile_stmt(self, ctx:SASParser.Infile_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#file_specification.
    def visitFile_specification(self, ctx:SASParser.File_specificationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#actual_dataLines.
    def visitActual_dataLines(self, ctx:SASParser.Actual_dataLinesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#infile_options.
    def visitInfile_options(self, ctx:SASParser.Infile_optionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#input_stmt.
    def visitInput_stmt(self, ctx:SASParser.Input_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#proc_stmt_block_list.
    def visitProc_stmt_block_list(self, ctx:SASParser.Proc_stmt_block_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#proc_freq_block.
    def visitProc_freq_block(self, ctx:SASParser.Proc_freq_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#proc_means_block.
    def visitProc_means_block(self, ctx:SASParser.Proc_means_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#proc_means_options.
    def visitProc_means_options(self, ctx:SASParser.Proc_means_optionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#statistic_keyword.
    def visitStatistic_keyword(self, ctx:SASParser.Statistic_keywordContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#spaced_identifiers.
    def visitSpaced_identifiers(self, ctx:SASParser.Spaced_identifiersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#proc_means_stmt_list.
    def visitProc_means_stmt_list(self, ctx:SASParser.Proc_means_stmt_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#var_stmt.
    def visitVar_stmt(self, ctx:SASParser.Var_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#title_stmt.
    def visitTitle_stmt(self, ctx:SASParser.Title_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#data_main.
    def visitData_main(self, ctx:SASParser.Data_mainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#data_stmt.
    def visitData_stmt(self, ctx:SASParser.Data_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#dataset_name_opt.
    def visitDataset_name_opt(self, ctx:SASParser.Dataset_name_optContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#datastmt_cmd.
    def visitDatastmt_cmd(self, ctx:SASParser.Datastmt_cmdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#view_dsname_opt.
    def visitView_dsname_opt(self, ctx:SASParser.View_dsname_optContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#view_name.
    def visitView_name(self, ctx:SASParser.View_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#dataset_name.
    def visitDataset_name(self, ctx:SASParser.Dataset_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#program_name.
    def visitProgram_name(self, ctx:SASParser.Program_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#passwd_opt.
    def visitPasswd_opt(self, ctx:SASParser.Passwd_optContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#source_opt.
    def visitSource_opt(self, ctx:SASParser.Source_optContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#expression.
    def visitExpression(self, ctx:SASParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#expressionList.
    def visitExpressionList(self, ctx:SASParser.ExpressionListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#of_var_list.
    def visitOf_var_list(self, ctx:SASParser.Of_var_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#identifiers_list.
    def visitIdentifiers_list(self, ctx:SASParser.Identifiers_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#in_var_list.
    def visitIn_var_list(self, ctx:SASParser.In_var_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#colonInts.
    def visitColonInts(self, ctx:SASParser.ColonIntsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#literal.
    def visitLiteral(self, ctx:SASParser.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SASParser#variables.
    def visitVariables(self, ctx:SASParser.VariablesContext):
        return self.visitChildren(ctx)



del SASParser