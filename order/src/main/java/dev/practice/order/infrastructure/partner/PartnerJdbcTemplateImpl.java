package dev.practice.order.infrastructure.partner;

import dev.practice.order.domain.partner.Partner;
import dev.practice.order.domain.partner.PartnerReader;
import dev.practice.order.domain.partner.PartnerStore;
import org.springframework.jdbc.core.JdbcTemplate;

// 이와 같은 방식으로 JPA 외의 라이브러리로 구현해야 할 경우 확장,변경이 용이함
//@Component
public class PartnerJdbcTemplateImpl implements PartnerReader, PartnerStore {
    JdbcTemplate jdbcTemplate;

    @Override
    public Partner getPartner(Long partnerId) {
        return null;
    }

    @Override
    public Partner getPartner(String partnerToken) {
        return null;
    }

    @Override
    public Partner store(Partner initPartner) {
        return null;
    }
}
