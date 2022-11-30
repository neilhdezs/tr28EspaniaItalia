package es.nhs.models;

import java.util.List;
import java.util.UUID;

public class Shot
{

    private UUID key_pass_id;
    private List<Integer> end_location;
    private Boolean aerial_won;
    private Boolean follows_dribble;
    private Boolean first_time;
    private List<FreezeFrame> freeze_frame;

}
