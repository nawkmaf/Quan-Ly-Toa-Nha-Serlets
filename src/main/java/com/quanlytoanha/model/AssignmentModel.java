package com.quanlytoanha.model;

public class AssignmentModel extends AbstractModel<AssignmentModel> {

    private long userId;
    private long buildingId;

    public static final String tableName = "assignment";

    private long userIds[];

    public long[] getUserIds() {
        return userIds;
    }

    public void setUserIds(long[] userIds) {
        this.userIds = userIds;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(long buildingId) {
        this.buildingId = buildingId;
    }


}
