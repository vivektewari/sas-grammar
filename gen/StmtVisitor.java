// Generated from /home/pooja/PycharmProjects/sas-grammar/Stmt.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StmtParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(StmtParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(StmtParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(StmtParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StmtParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(StmtParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(StmtParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(StmtParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(StmtParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(StmtParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(StmtParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(StmtParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(StmtParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(StmtParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(StmtParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(StmtParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(StmtParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#input_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_main(StmtParser.Input_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#input_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_stmt(StmtParser.Input_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#put_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_stmt(StmtParser.Put_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#input_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_specification(StmtParser.Input_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#put_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_specification(StmtParser.Put_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#pointer_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_control(StmtParser.Pointer_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#informat_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformat_list(StmtParser.Informat_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#input_variable_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_variable_format(StmtParser.Input_variable_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#input_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_variable(StmtParser.Input_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#put_variable_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_variable_format(StmtParser.Put_variable_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#put_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_variable(StmtParser.Put_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#column_point_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_point_control(StmtParser.Column_point_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#line_point_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_point_control(StmtParser.Line_point_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#format_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_modifier(StmtParser.Format_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link StmtParser#column_specifications}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_specifications(StmtParser.Column_specificationsContext ctx);
}