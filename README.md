# cdirubbio-project1
  UT failures 8,9,10
## Simulator


## The Mouse class #


## The Cat class 


  In the step method: only die, update any counters associated with dying/lifespan, and randomly turn. Remember that in the simulator step will always be called before takeAction.

  In the takeAction method: you'll want to do anything associated with chasing (if a Cat), or adding the mouse (if a Mouse).

  Basically, make sure your step is not doing more that updating the life of the creature and doing a naive move. Because takeAction is called after step in the simulator, for cats that need to chase, the direction will be updated in the takeAction method if they need to chase, overwriting any direction update in step.

  Also, check your output for negative coordinates; not only will these not plot, but you'll want to wrap the negative coordinates around the board. Hint: use modulus with WIDTH or HEIGHT in this expression.