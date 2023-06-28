# Rock Paper Scissors API
## Technology
- Java + Spring Boot with Spring MVC 
## Endpoints
- GET /rules
    - Returns the rules of the game in a structured JSON response.
- POST /play
    - Receives a JSON body with the user's selected hand (Rock, Paper, or Scissor) and returns a JSON response whether the user has won this round (boolean value) or not along the hand selected by the computer opponent
    - Additionally, the corresponding rule that decides whether the user wins or not can also be returned if requested by the caller via the 'explain' boolean query parameter (either '?explain' or '?explain=true' is required).

## Demostrate with Postman API example
- The examples can be found here: https://www.postman.com/science-geoscientist-66931303/workspace/rock-paper-scissors/collection/17549220-e799f732-f171-4fd0-b57a-bff83afbb159?action=share&creator=17549220
