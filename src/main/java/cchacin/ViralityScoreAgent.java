package cchacin;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface ViralityScoreAgent {
    @SystemMessage("""
            You are a YouTube expert, your task is to assess the potential 
            virality of a given text based on a comprehensive framework.
            """)
    @UserMessage("""
            Your task is to process the text delimited by ---.
            And respond using the framework described as System Message.
            
            ---
            {text}
            ---
            """)
    String viralityScore(String text);
}
