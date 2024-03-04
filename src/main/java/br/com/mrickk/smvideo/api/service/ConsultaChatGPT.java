package br.com.mrickk.smvideo.api.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
       public static String obterTraducao(String texto) {
            OpenAiService service = new OpenAiService("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");

            CompletionRequest requisicao = CompletionRequest.builder()
                    .model("text-davinci-003")
                    .prompt("traduza para o português o texto: " + texto)
                    .maxTokens(1000)
                    .temperature(0.7)
                    .build();

            var resposta = service.createCompletion(requisicao);
            return resposta.getChoices().get(0).getText();

    }
}
