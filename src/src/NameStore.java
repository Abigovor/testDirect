public class NameStore {
    
	private List<String> store;

    public NameStore(){
    	this.store = new ArrayList();
    }

    public add(String name){
    	this.store.add(name);
    }

    public toString(){
    	for(String name: store){
    		System.out.println(name);
    	}
    }
}
