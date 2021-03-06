package kosterror.shift.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewPostDTO {

    private String authorId;

    private String title;

    private String text;
}
