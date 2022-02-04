package com.devsuperior.bds01.dto;

import com.devsuperior.bds01.entities.City;
import java.io.Serializable;

public class CityDTO implements Serializable
{
	private Long id;
	private String name;

	public CityDTO()
	{
	}

	public CityDTO(Long id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public CityDTO(City city)
	{
		this.id = city.getId();
		this.name = city.getName();
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
