package gov.ny.webhook.model;

import lombok.Data;

@Data
public class WebhookRequest{
	private String connectionProtocol;
	private String routingState;
	private String rfc23State;
	private String updatedAt;
	private String connectionId;
	private String theirRole;
	private String createdAt;
	private String state;
	private String invitationKey;
	private String accept;
	private String invitationMode;

	@Override
 	public String toString(){
		return 
			"WebhookRequest{" + 
			"connection_protocol = '" + connectionProtocol + '\'' + 
			",routing_state = '" + routingState + '\'' + 
			",rfc23_state = '" + rfc23State + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",connection_id = '" + connectionId + '\'' + 
			",their_role = '" + theirRole + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",state = '" + state + '\'' + 
			",invitation_key = '" + invitationKey + '\'' + 
			",accept = '" + accept + '\'' + 
			",invitation_mode = '" + invitationMode + '\'' + 
			"}";
		}
}
