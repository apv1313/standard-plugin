package com.sbezboro.standardplugin;

import org.bukkit.configuration.Configuration;

public class StandardConfig {
	private StandardPlugin plugin;

	private int serverId = 0;
	private String secretKey = "";
	private boolean debug = false;

	private String endpoint;
	private String rtsAddress;
	private int pvpProtectionTime;
	private int hungerProtectionTime;
	private int newbieStalkerThreshold;
	
	private int endResetPeriod;

	public StandardConfig(StandardPlugin plugin) {
		this.plugin = plugin;
	}

	public void reload() {
		Configuration config = plugin.getConfig();
		
		serverId = config.getInt("server-id");
		plugin.getLogger().info("Plugin starting with server id " + serverId);

		secretKey = config.getString("secret-key");

		debug = config.getBoolean("debug");
		if (debug) {
			plugin.getLogger().info("Debug mode enabled!");
		}

		endpoint = config.getString("endpoint");
		rtsAddress = config.getString("rts-address");
		pvpProtectionTime = config.getInt("pvp-protection-time");
		hungerProtectionTime = config.getInt("hunger-protection-time");
		newbieStalkerThreshold = config.getInt("newbie-stalker-threshold");

		endResetPeriod = config.getInt("end-reset-period");
	}

	public int getServerId() {
		return serverId;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public boolean isDebug() {
		return debug;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public String getRTSAddress() {
		return rtsAddress;
	}

	public int getPvpProtectionTime() {
		return pvpProtectionTime;
	}

	public int getHungerProtectionTime() {
		return hungerProtectionTime;
	}

	public int getNewbieStalkerThreshold() {
		return newbieStalkerThreshold;
	}

	public int getEndResetPeriod() {
		return endResetPeriod;
	}
}