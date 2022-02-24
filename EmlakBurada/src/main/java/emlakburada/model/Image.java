package emlakburada.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Image {
    private String id;
    private String path;
    private String format;

    public Image(String path, String format){
        this.path = path;
        this.format = format;
    }

}
