package GameBackend.business.abstracts;

import GameBackend.entities.Campaign;

public interface CampaignService {
	public void add(Campaign campaign);
	public void delete(Campaign campaign);
	public void update(Campaign campaign);
}
