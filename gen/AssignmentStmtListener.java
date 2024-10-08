// Generated from /home/pooja/PycharmProjects/sas-grammar/AssignmentStmt.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssignmentStmtParser}.
 */
public interface AssignmentStmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AssignmentStmtParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AssignmentStmtParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AssignmentStmtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AssignmentStmtParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(AssignmentStmtParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(AssignmentStmtParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(AssignmentStmtParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(AssignmentStmtParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AssignmentStmtParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AssignmentStmtParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(AssignmentStmtParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(AssignmentStmtParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(AssignmentStmtParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(AssignmentStmtParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AssignmentStmtParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AssignmentStmtParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(AssignmentStmtParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(AssignmentStmtParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(AssignmentStmtParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(AssignmentStmtParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(AssignmentStmtParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(AssignmentStmtParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(AssignmentStmtParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(AssignmentStmtParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(AssignmentStmtParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(AssignmentStmtParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AssignmentStmtParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AssignmentStmtParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(AssignmentStmtParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(AssignmentStmtParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#input_main}.
	 * @param ctx the parse tree
	 */
	void enterInput_main(AssignmentStmtParser.Input_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#input_main}.
	 * @param ctx the parse tree
	 */
	void exitInput_main(AssignmentStmtParser.Input_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(AssignmentStmtParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(AssignmentStmtParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#put_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPut_stmt(AssignmentStmtParser.Put_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#put_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPut_stmt(AssignmentStmtParser.Put_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#input_specification}.
	 * @param ctx the parse tree
	 */
	void enterInput_specification(AssignmentStmtParser.Input_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#input_specification}.
	 * @param ctx the parse tree
	 */
	void exitInput_specification(AssignmentStmtParser.Input_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#put_specification}.
	 * @param ctx the parse tree
	 */
	void enterPut_specification(AssignmentStmtParser.Put_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#put_specification}.
	 * @param ctx the parse tree
	 */
	void exitPut_specification(AssignmentStmtParser.Put_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#pointer_control}.
	 * @param ctx the parse tree
	 */
	void enterPointer_control(AssignmentStmtParser.Pointer_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#pointer_control}.
	 * @param ctx the parse tree
	 */
	void exitPointer_control(AssignmentStmtParser.Pointer_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#informat_list}.
	 * @param ctx the parse tree
	 */
	void enterInformat_list(AssignmentStmtParser.Informat_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#informat_list}.
	 * @param ctx the parse tree
	 */
	void exitInformat_list(AssignmentStmtParser.Informat_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#input_variable_format}.
	 * @param ctx the parse tree
	 */
	void enterInput_variable_format(AssignmentStmtParser.Input_variable_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#input_variable_format}.
	 * @param ctx the parse tree
	 */
	void exitInput_variable_format(AssignmentStmtParser.Input_variable_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#input_variable}.
	 * @param ctx the parse tree
	 */
	void enterInput_variable(AssignmentStmtParser.Input_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#input_variable}.
	 * @param ctx the parse tree
	 */
	void exitInput_variable(AssignmentStmtParser.Input_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#put_variable_format}.
	 * @param ctx the parse tree
	 */
	void enterPut_variable_format(AssignmentStmtParser.Put_variable_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#put_variable_format}.
	 * @param ctx the parse tree
	 */
	void exitPut_variable_format(AssignmentStmtParser.Put_variable_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#put_variable}.
	 * @param ctx the parse tree
	 */
	void enterPut_variable(AssignmentStmtParser.Put_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#put_variable}.
	 * @param ctx the parse tree
	 */
	void exitPut_variable(AssignmentStmtParser.Put_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#column_point_control}.
	 * @param ctx the parse tree
	 */
	void enterColumn_point_control(AssignmentStmtParser.Column_point_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#column_point_control}.
	 * @param ctx the parse tree
	 */
	void exitColumn_point_control(AssignmentStmtParser.Column_point_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#line_point_control}.
	 * @param ctx the parse tree
	 */
	void enterLine_point_control(AssignmentStmtParser.Line_point_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#line_point_control}.
	 * @param ctx the parse tree
	 */
	void exitLine_point_control(AssignmentStmtParser.Line_point_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#format_modifier}.
	 * @param ctx the parse tree
	 */
	void enterFormat_modifier(AssignmentStmtParser.Format_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#format_modifier}.
	 * @param ctx the parse tree
	 */
	void exitFormat_modifier(AssignmentStmtParser.Format_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignmentStmtParser#column_specifications}.
	 * @param ctx the parse tree
	 */
	void enterColumn_specifications(AssignmentStmtParser.Column_specificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignmentStmtParser#column_specifications}.
	 * @param ctx the parse tree
	 */
	void exitColumn_specifications(AssignmentStmtParser.Column_specificationsContext ctx);
}