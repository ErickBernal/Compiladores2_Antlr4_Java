import Parser.GramaticaBaseVisitor;
import Parser.GramaticaParser;

public class MyVisitor extends  GramaticaBaseVisitor<Object> {



    @Override public Object visitPrule(GramaticaParser.PruleContext ctx) {
        System.out.println("<estoy en prule> "+ ctx.toString());
        return visitChildren(ctx);
    }


    @Override public Object visitSegundo(GramaticaParser.SegundoContext ctx) {
        return visitChildren(ctx);
    }



}
