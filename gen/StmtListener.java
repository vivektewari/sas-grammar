// Generated from /home/pooja/PycharmProjects/sas-grammar/Stmt.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StmtParser}.
 */
public interface StmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StmtParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(StmtParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(StmtParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(StmtParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(StmtParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(StmtParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(StmtParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StmtParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StmtParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(StmtParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(StmtParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(StmtParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(StmtParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(StmtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(StmtParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(StmtParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(StmtParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(StmtParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(StmtParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(StmtParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(StmtParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(StmtParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(StmtParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(StmtParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(StmtParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(StmtParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(StmtParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(StmtParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(StmtParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(StmtParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(StmtParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(StmtParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(StmtParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#input_main}.
	 * @param ctx the parse tree
	 */
	void enterInput_main(StmtParser.Input_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#input_main}.
	 * @param ctx the parse tree
	 */
	void exitInput_main(StmtParser.Input_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(StmtParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(StmtParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#put_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPut_stmt(StmtParser.Put_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#put_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPut_stmt(StmtParser.Put_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#input_specification}.
	 * @param ctx the parse tree
	 */
	void enterInput_specification(StmtParser.Input_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#input_specification}.
	 * @param ctx the parse tree
	 */
	void exitInput_specification(StmtParser.Input_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#put_specification}.
	 * @param ctx the parse tree
	 */
	void enterPut_specification(StmtParser.Put_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#put_specification}.
	 * @param ctx the parse tree
	 */
	void exitPut_specification(StmtParser.Put_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#pointer_control}.
	 * @param ctx the parse tree
	 */
	void enterPointer_control(StmtParser.Pointer_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#pointer_control}.
	 * @param ctx the parse tree
	 */
	void exitPointer_control(StmtParser.Pointer_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#informat_list}.
	 * @param ctx the parse tree
	 */
	void enterInformat_list(StmtParser.Informat_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#informat_list}.
	 * @param ctx the parse tree
	 */
	void exitInformat_list(StmtParser.Informat_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#input_variable_format}.
	 * @param ctx the parse tree
	 */
	void enterInput_variable_format(StmtParser.Input_variable_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#input_variable_format}.
	 * @param ctx the parse tree
	 */
	void exitInput_variable_format(StmtParser.Input_variable_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#input_variable}.
	 * @param ctx the parse tree
	 */
	void enterInput_variable(StmtParser.Input_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#input_variable}.
	 * @param ctx the parse tree
	 */
	void exitInput_variable(StmtParser.Input_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#put_variable_format}.
	 * @param ctx the parse tree
	 */
	void enterPut_variable_format(StmtParser.Put_variable_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#put_variable_format}.
	 * @param ctx the parse tree
	 */
	void exitPut_variable_format(StmtParser.Put_variable_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#put_variable}.
	 * @param ctx the parse tree
	 */
	void enterPut_variable(StmtParser.Put_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#put_variable}.
	 * @param ctx the parse tree
	 */
	void exitPut_variable(StmtParser.Put_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#column_point_control}.
	 * @param ctx the parse tree
	 */
	void enterColumn_point_control(StmtParser.Column_point_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#column_point_control}.
	 * @param ctx the parse tree
	 */
	void exitColumn_point_control(StmtParser.Column_point_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#line_point_control}.
	 * @param ctx the parse tree
	 */
	void enterLine_point_control(StmtParser.Line_point_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#line_point_control}.
	 * @param ctx the parse tree
	 */
	void exitLine_point_control(StmtParser.Line_point_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#format_modifier}.
	 * @param ctx the parse tree
	 */
	void enterFormat_modifier(StmtParser.Format_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#format_modifier}.
	 * @param ctx the parse tree
	 */
	void exitFormat_modifier(StmtParser.Format_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link StmtParser#column_specifications}.
	 * @param ctx the parse tree
	 */
	void enterColumn_specifications(StmtParser.Column_specificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StmtParser#column_specifications}.
	 * @param ctx the parse tree
	 */
	void exitColumn_specifications(StmtParser.Column_specificationsContext ctx);
}