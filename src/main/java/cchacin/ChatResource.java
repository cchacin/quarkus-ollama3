package cchacin;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/chat")
public class ChatResource {

    private final ViralityScoreAgent viralityScore;

    public ChatResource(
            ViralityScoreAgent viralityScore) {
        this.viralityScore = viralityScore;
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String chat(String body) {
        return viralityScore.viralityScore(body);
    }
}