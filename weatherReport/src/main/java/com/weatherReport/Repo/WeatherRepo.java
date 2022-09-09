package com.weatherReport.Repo;

import org.springframework.data.repository.CrudRepository;

import com.weatherReport.Domain.Weather;


public interface WeatherRepo extends CrudRepository<Weather,Integer>{

}
