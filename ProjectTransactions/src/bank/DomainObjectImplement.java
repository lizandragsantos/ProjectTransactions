package bank;

public abstract class DomainObjectImplement implements DomainObject {
	
	private Long id;

	public DomainObjectImplement(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	

}
