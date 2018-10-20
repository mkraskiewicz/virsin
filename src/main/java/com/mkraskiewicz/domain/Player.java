package com.mkraskiewicz.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Player.
 */
@Entity
@Table(name = "player")
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "experience")
    private Integer experience;

    @Column(name = "jhi_level")
    private Integer level;

    @Column(name = "strength")
    private Integer strength;

    @Column(name = "jhi_condition")
    private Integer condition;

    @Column(name = "dexterity")
    private Integer dexterity;

    @Column(name = "luck")
    private Integer luck;

    @Column(name = "gold")
    private Integer gold;

    @OneToOne    @JoinColumn(unique = true)
    private User user;

    @OneToMany(mappedBy = "player")
    private Set<Item> equipment = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Player imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getExperience() {
        return experience;
    }

    public Player experience(Integer experience) {
        this.experience = experience;
        return this;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getLevel() {
        return level;
    }

    public Player level(Integer level) {
        this.level = level;
        return this;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStrength() {
        return strength;
    }

    public Player strength(Integer strength) {
        this.strength = strength;
        return this;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getCondition() {
        return condition;
    }

    public Player condition(Integer condition) {
        this.condition = condition;
        return this;
    }

    public void setCondition(Integer condition) {
        this.condition = condition;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public Player dexterity(Integer dexterity) {
        this.dexterity = dexterity;
        return this;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getLuck() {
        return luck;
    }

    public Player luck(Integer luck) {
        this.luck = luck;
        return this;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }

    public Integer getGold() {
        return gold;
    }

    public Player gold(Integer gold) {
        this.gold = gold;
        return this;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public User getUser() {
        return user;
    }

    public Player user(User user) {
        this.user = user;
        return this;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Item> getEquipment() {
        return equipment;
    }

    public Player equipment(Set<Item> items) {
        this.equipment = items;
        return this;
    }

    public Player addEquipment(Item item) {
        this.equipment.add(item);
        item.setPlayer(this);
        return this;
    }

    public Player removeEquipment(Item item) {
        this.equipment.remove(item);
        item.setPlayer(null);
        return this;
    }

    public void setEquipment(Set<Item> items) {
        this.equipment = items;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Player player = (Player) o;
        if (player.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), player.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Player{" +
            "id=" + getId() +
            ", imageUrl='" + getImageUrl() + "'" +
            ", experience=" + getExperience() +
            ", level=" + getLevel() +
            ", strength=" + getStrength() +
            ", condition=" + getCondition() +
            ", dexterity=" + getDexterity() +
            ", luck=" + getLuck() +
            ", gold=" + getGold() +
            "}";
    }
}
