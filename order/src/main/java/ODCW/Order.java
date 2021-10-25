package ODCW;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Document(collection = "Order")
public class Order {
    @Id
    private String id;
    private String model;
    private String wipes;
    private String location;

    public Order(String id, String model, String wipes, String location) {
        this.id = id;
        this.setModel(model);
        this.setWipes(wipes);
        this.setLocation(location);
     
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getWipes() {
		return wipes;
	}

	public void setWipes(String wipes) {
		this.wipes = wipes;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}



@Override
public String toString() {
    return "User{" +
            "id='" + id + '\'' +
            ", model='" + model + '\'' +
            ", wipes='" + wipes + '\'' +
            ", location='" + location + '\'' +
            '}';
}

}