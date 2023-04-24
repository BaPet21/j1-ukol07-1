package cz.czechitas.ukol07.svatky;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.stream.Stream;


public class SeznamSvatku {

    private List<Svatek> svatky;

    public List<Svatek> getSvatky() {
        return svatky;
    }

    public void setSvatky(List<Svatek> svatky) {
        this.svatky = svatky;
    }

    public Stream<String> stream() {
        return (Stream<String>) svatky;
    }
}
