package padroes.singleton;

public class SingletonLazyHolder {
	
private static class IstanceHolder {
	public static SingletonLazyHolder instancia= new SingletonLazyHolder();
}

	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return IstanceHolder.instancia;
	
	}
}
