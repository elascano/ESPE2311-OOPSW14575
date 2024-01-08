# car.rb
require_relative 'Engine'
require_relative 'Tire'

class Car
  attr_accessor :brand, :model, :color, :tires, :engine
  def initialize(brand, model, color, tires, engine)
    @brand = brand
    @model = model
    @color = color
    @tires = tires
    @engine = engine
  end

  def display_information
    puts "Car Information:"
    puts "Brand: #{brand}"
    puts "Model: #{model}"
    puts "Color: #{color}"
    puts "Tires:"
    tires.each_with_index do |tire, index|
      puts "#{index + 1}. Diameter: #{tire.diameter}, Brand: #{tire.brand}"
    end
    puts "Engine: #{engine.brand}"
  end

  def car_to_json
    {
      brand: brand,
      model: model,
      color: color,
      tires: tires.map { |tire| { diameter: tire.diameter, brand: tire.brand } },
      engine: { brand: engine.brand }
    }.to_json
  end

  def self.from_json(json)
    data = JSON.parse(json)
    tires = data['tires'].map { |tire_data| Tire.new(tire_data['diameter'], tire_data['brand']) }
    engine = Engine.new(data['engine']['brand'])
    new(data['brand'], data['model'], data['color'], tires, engine)
  end

  def turn_off
    puts "Car is turn off"
  end

  def speed_up
    puts "Car is speed up"
  end

  def Start
    puts "Car is ready"
  end

  def acelerate (speed)
    puts "Car has a acceleration of #{speed}"
  end

  def brake
    puts "Braking car"
  end
end
