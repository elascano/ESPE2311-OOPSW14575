# engine.rb
class Engine
  attr_accessor :brand

  def initialize(brand)
    @brand = brand
  end

  def to_s
    "Engine: #{brand}"
  end

  def start
    puts "Engine is on"
  end

  def turn_off
    puts "Engine is off"
  end
end
