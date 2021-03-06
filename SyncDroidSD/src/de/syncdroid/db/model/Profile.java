package de.syncdroid.db.model;

import de.syncdroid.db.model.enums.ProfileType;
import de.syncdroid.db.model.enums.SyncType;

import java.util.Date;

@SuppressWarnings("serial")
public class Profile implements Model {
	private Long id;
	private Boolean enabled = true;
	private String name;
	private Date lastSync;
	private Boolean onlyIfWifi = false;
	
	private String hostname;
	private String username;
	private String password;
	private Integer port;
	private String localPath;
	private String remotePath;
	
	private ProfileType profileType;
	private SyncType syncType;
	private Location location;

    @Override
	public String toString() {
		return name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLastSync() {
		return lastSync;
	}
	public void setLastSync(Date lastSync) {
		this.lastSync = lastSync;
	}
	public Boolean getOnlyIfWifi() {
		return onlyIfWifi;
	}
	public void setOnlyIfWifi(Boolean onlyIfWifi) {
		this.onlyIfWifi = onlyIfWifi;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getLocalPath() {
		return localPath;
	}
	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}
	public String getRemotePath() {
		return remotePath;
	}
	public void setRemotePath(String remotePath) {
		this.remotePath = remotePath;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public ProfileType getProfileType() {
		return profileType;
	}

	public void setProfileType(ProfileType profileType) {
		this.profileType = profileType;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
    public SyncType getSyncType() {
        return syncType;
    }

    public void setSyncType(SyncType syncType) {
        this.syncType = syncType;
    }

}
