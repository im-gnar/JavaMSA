package dev.practice.order.interfaces.partner;

import dev.practice.order.application.partner.PartnerFacade;
import dev.practice.order.common.response.CommonResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/partners")
public class PartnerApiController {
    private final PartnerFacade partnerFacade;
    private final PartnerDtoMapper partnerDtoMapper;

    @PostMapping
    public CommonResponse registerPartner(@RequestBody @Valid PartnerDto.RegisterRequest request) {
        // 1. 외부에서 전달된 파라미터(dto) -> Command, Criteria convert
        // var command = request.toCommand();
        var command = partnerDtoMapper.of(request);
        // 2. facade 호출 ... PartnerInfo
        var partnerInfo = partnerFacade.registerPartner(command);
        // 3. PartnerInfo -> CommandResponse convert AND return
        var response = new PartnerDto.RegisterResponse(partnerInfo);
        return CommonResponse.success(response);
    }
}
