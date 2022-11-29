package es.nhs.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Event
{

    private UUID id;
    private int index;
    private int period;
    private LocalDateTime time_stamp;
    private int minute;
    private int second;
    private Type type;
    private int possession;
    private Team possession_team;
    private PlayPattern play_pattern;
    private Team team;
    private Player player;
    private Position position;
    private List<Integer> location;
    private Double duration;
    private Boolean under_pressure;
    private Boolean off_camera;
    private Boolean out;
    private List<UUID> related_events;
    private Tactics tactics;
    private BallReceipt ball_receipt;
    private BallRecovery ball_recovery;
    private Carry carry;
    private Clearance clearance;
    private Dribble dribble;
    private Duel duel;
    private Goalkeeper goalkeeper;
    private Interception interception;
    private Pass pass;


}
