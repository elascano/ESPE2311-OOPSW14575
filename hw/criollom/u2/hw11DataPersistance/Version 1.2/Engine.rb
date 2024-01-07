# engine.rb
class Engine
  attr_accessor :brand

  def initialize(brand)
    @brand = brand
  end

  def to_s
    "Engine: #{brand}"
  end
end
