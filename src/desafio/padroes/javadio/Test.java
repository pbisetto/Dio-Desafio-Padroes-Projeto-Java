package desafio.padroes.javadio;
import desafio.padroes.javadio.facade.Facade;
import desafio.padroes.javadio.singleton.SingletonEager;
import desafio.padroes.javadio.singleton.SingletonLazy;
import desafio.padroes.javadio.singleton.SingletonLazyHolder;
import desafio.padroes.javadio.strategy.Comportamento;
import desafio.padroes.javadio.strategy.ComportamentoAgressivo;
import desafio.padroes.javadio.strategy.ComportamentoDefensivo;
import desafio.padroes.javadio.strategy.ComportamentoNormal;
import desafio.padroes.javadio.strategy.Robo;

public class Test {

    public static void main(String[] args) {

        // Singleton
        System.out.println("\n---Teste do singleton---\n");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy
        
        System.out.println("\n\n---Teste do robo---\n");
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade
        
        System.out.println("\n\n---Teste da facade---\n");
        Facade facade = new Facade();
        facade.migrarCliente("23456728743","Venilton", "14801788");
    }

}
