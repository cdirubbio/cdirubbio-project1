# cdirubbio-project1

## Simulator


## The Mouse class #


## The Cat class 


A cat searches up to 20 grid points (as measured by the GridPoint.distance() method) for a mouse to chase. To pass the unit tests, it first checks if the cat needs to move NORTH/SOUTH (if the vertical distance is strictly greater than the horizontal distance); otherwise, it will move EAST/WEST. If the mouse is on the other side of the grid but is flagged as closest due to the grid wrapping, you should let your code go in the naive direction towards the mouse even if that makes it go further away from the target (this is easier to code up than the alternative).

If the cat finds a mouse, it moves towards the mouse and is displayed using the color cyan. (This is to make it easier for you to debug, and for us to grade). If the cat cannot find a mouse, it moves normaly and is displayed in yellow.

Cats are displayed as a yellow dot.