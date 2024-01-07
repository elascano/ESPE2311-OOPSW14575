# tire.rb
class Tire
  attr_accessor :diameter, :brand

  def initialize(diameter, brand)
    @diameter = diameter
    @brand = brand
  end

  def to_s
    "#{brand} - Diameter: #{diameter}"
  end


end
