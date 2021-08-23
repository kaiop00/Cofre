
public class Item {

	private String descricao;
	private int volume;

    public Item(String descricao, int volume) {
    	this.descricao=descricao;
    	this.volume=volume;
        
    }
    
    public int getVolume() {
		return volume;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
    public String toString() {
        return "Item{" +
                "volume=" + this.volume +
                ", descricao='" + this.descricao + '\'' +
                '}';
    }
}
