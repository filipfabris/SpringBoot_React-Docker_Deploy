package hr.fer.tel.server.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import hr.fer.tel.server.rest.dto.InputsDTO;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Inputs {

	@Id
	@GeneratedValue
	private long id;
	
	private InputType inputType;
	private String name;
	private String title;

	public Inputs(long id, InputType inputType, String name, String title) {
		super();
		this.id = id;
		this.inputType = inputType;
		this.name = name;
		this.title = title;
	}

	public Inputs() {

	}

	public Inputs(InputsDTO inputs) {
		this.inputType = inputs.getInputType();
		this.name = inputs.getName();
		this.title = inputs.getTitle();
		//this(0, inputs.getInputType(), inputs.getName(), inputs.getTitle());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public InputType getInputType() {
		return inputType;
	}

	public void setInputType(InputType inputType) {
		this.inputType = inputType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
