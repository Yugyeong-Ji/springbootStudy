package dto;

import com.jojoldu.admin.web.dto.HelloResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombokTest(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);//isEqualTo는 assertj의 동등 메소드, assertThat의 값과 같을 때만 성공
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
