class Engine
  attr_accessor :type

  def initialize(type)
    @type = type
  end

  def to_s
    "Engine: #{type}"
  end
end
