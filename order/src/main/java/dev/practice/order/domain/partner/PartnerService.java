package dev.practice.order.domain.partner;

public interface PartnerService {
    // Command(CUD), Criteria(R) -- Info(리턴객체)

    PartnerInfo registerPartner(PartnerCommand command);
    PartnerInfo getPartnerInfo(String partnerToken);
    PartnerInfo enablePartner(String partnerToken);
    PartnerInfo disablePartner(String partnerToken);
}
