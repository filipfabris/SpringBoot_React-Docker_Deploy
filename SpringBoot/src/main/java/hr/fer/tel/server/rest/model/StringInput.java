package hr.fer.tel.server.rest.model;

import javax.persistence.Entity;

import javax.persistence.Table;

import hr.fer.tel.server.rest.dto.StringInputDTO;

@Entity
@Table(name = "StringInput")
public class StringInput extends Inputs {

	private String description;
	private String defaultValue;
	private String pattern;

	public StringInput(String name, String title, String description, String defaultValue, String pattern) {
		super(0, InputType.STRING, name, title);
		this.description = description;
		this.defaultValue = defaultValue;
		this.pattern = pattern;
	}
	
	public StringInput(StringInputDTO input) {
		super(0, InputType.BOOLEAN, input.getName(), input.getTitle());
		this.description = input.getDescription();
		this.defaultValue = input.getDefaultValue();
		this.pattern = input.getPattern();
	}

	public StringInput() {

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

}
