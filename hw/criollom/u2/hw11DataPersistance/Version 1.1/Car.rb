require_relative 'Engine.rb'
require_relative 'Wheel.rb'

class Car
  attr_accessor :brand, :model, :color, :wheels, :engine

  def initialize(brand, model, color, wheels, engine)
    @brand = brand
    @model = model
    @color = color
    @wheels = wheels
    @engine = engine
  end

  def mostrar_informacion
    puts "Información del carro:"
    puts "Marca: #{brand}"
    puts "Modelo: #{model}"
    puts "Color: #{color}"
    puts "wheels:"
    wheels.each_with_index do |wheel, index|
      puts "#{index + 1}. #{wheel}"
    end
    puts engine
  end
end
