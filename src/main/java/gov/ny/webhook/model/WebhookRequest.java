package gov.ny.webhook.model;

import lombok.Data;


public @Data class WebhookRequest{
	private String connection_protocol;
	private String routing_state;
	private String rfc23_state;
	private String updated_at;
	private String connection_id;
	private String their_role;
	private String created_at;
	private String state;
	private String invitation_key;
	private String accept;
	private String invitation_mode;
}
