// Generated from /home/pooja/PycharmProjects/sas-grammar/AssignmentStmt.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssignmentStmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AssignmentStmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AssignmentStmtParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AssignmentStmtParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(AssignmentStmtParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(AssignmentStmtParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AssignmentStmtParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(AssignmentStmtParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(AssignmentStmtParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AssignmentStmtParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(AssignmentStmtParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(AssignmentStmtParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(AssignmentStmtParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(AssignmentStmtParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(AssignmentStmtParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AssignmentStmtParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(AssignmentStmtParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#input_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_main(AssignmentStmtParser.Input_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#input_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_stmt(AssignmentStmtParser.Input_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#put_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_stmt(AssignmentStmtParser.Put_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#input_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_specification(AssignmentStmtParser.Input_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#put_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_specification(AssignmentStmtParser.Put_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#pointer_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_control(AssignmentStmtParser.Pointer_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#informat_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformat_list(AssignmentStmtParser.Informat_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#input_variable_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_variable_format(AssignmentStmtParser.Input_variable_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#input_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_variable(AssignmentStmtParser.Input_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#put_variable_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_variable_format(AssignmentStmtParser.Put_variable_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#put_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_variable(AssignmentStmtParser.Put_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#column_point_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_point_control(AssignmentStmtParser.Column_point_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#line_point_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_point_control(AssignmentStmtParser.Line_point_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#format_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_modifier(AssignmentStmtParser.Format_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssignmentStmtParser#column_specifications}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_specifications(AssignmentStmtParser.Column_specificationsContext ctx);
}