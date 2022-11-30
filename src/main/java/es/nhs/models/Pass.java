package es.nhs.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

public class Pass
{
    private Recipient recipient;
    private double length;
    private double angle;
    private Heigth height;
    private List<Integer> end_location;
    private UUID assisted_shot_id;
    private Boolean backheel;
    private Boolean deflected;
    private Boolean miscommunication;
    private Boolean cross;
    private Boolean cut_back;
    @JsonProperty("switch")
    private Boolean switchParam;
    private Boolean shot_assist;
    private Boolean goal_assist;
    private BodyPart body_part;
    private Type type;
    private OutCome outcome;
    private Technique technique;


    public Pass()
    {

    }

    public Recipient getRecipient()
    {
        return this.recipient;
    }

    public void setRecipient(Recipient recipient)
    {
        this.recipient = recipient;
    }

    public double getLength()
    {
        return this.length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getAngle()
    {
        return this.angle;
    }

    public void setAngle(double angle)
    {
        this.angle = angle;
    }

    public Heigth getHeight()
    {
        return this.height;
    }

    public void setHeight(Heigth height)
    {
        this.height = height;
    }

    public List<Integer> getEnd_location()
    {
        return this.end_location;
    }

    public void setEnd_location(List<Integer> end_location)
    {
        this.end_location = end_location;
    }

    public UUID getAssisted_shot_id()
    {
        return this.assisted_shot_id;
    }

    public void setAssisted_shot_id(UUID assisted_shot_id)
    {
        this.assisted_shot_id = assisted_shot_id;
    }

    public Boolean getBackheel()
    {
        return this.backheel;
    }

    public void setBackheel(Boolean backheel)
    {
        this.backheel = backheel;
    }

    public Boolean getDeflected()
    {
        return this.deflected;
    }

    public void setDeflected(Boolean deflected)
    {
        this.deflected = deflected;
    }

    public Boolean getMiscommunication()
    {
        return this.miscommunication;
    }

    public void setMiscommunication(Boolean miscommunication)
    {
        this.miscommunication = miscommunication;
    }

    public Boolean getCross()
    {
        return this.cross;
    }

    public void setCross(Boolean cross)
    {
        this.cross = cross;
    }

    public Boolean getCut_back()
    {
        return this.cut_back;
    }

    public void setCut_back(Boolean cut_back)
    {
        this.cut_back = cut_back;
    }

    @JsonProperty("switch")
    public Boolean getSwitchParam()
    {
        return this.switchParam;
    }

    @JsonProperty("switch")
    public void setSwitchParam(Boolean switchParam)
    {
        this.switchParam = switchParam;
    }

    public Boolean getShot_assist()
    {
        return this.shot_assist;
    }

    public void setShot_assist(Boolean shot_assist)
    {
        this.shot_assist = shot_assist;
    }

    public Boolean getGoal_assist()
    {
        return this.goal_assist;
    }

    public void setGoal_assist(Boolean goal_assist)
    {
        this.goal_assist = goal_assist;
    }

    public BodyPart getBody_part()
    {
        return this.body_part;
    }

    public void setBody_part(BodyPart body_part)
    {
        this.body_part = body_part;
    }

    public Type getType()
    {
        return this.type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }

    public OutCome getOutcome()
    {
        return this.outcome;
    }

    public void setOutcome(OutCome outcome)
    {
        this.outcome = outcome;
    }

    public Technique getTechnique()
    {
        return this.technique;
    }

    public void setTechnique(Technique technique)
    {
        this.technique = technique;
    }
}
