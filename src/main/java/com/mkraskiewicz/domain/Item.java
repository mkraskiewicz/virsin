package com.mkraskiewicz.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

import com.mkraskiewicz.domain.enumeration.ItemType;

/**
 * A Item.
 */
@Entity
@Table(name = "item")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "image_url")
    private String imageUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "jhi_type")
    private ItemType type;

    @Column(name = "equipped")
    private Boolean equipped;

    @Column(name = "str_bonus")
    private Integer strBonus;

    @Column(name = "con_bonus")
    private Integer conBonus;

    @Column(name = "dex_bonus")
    private Integer dexBonus;

    @Column(name = "luck_bonus")
    private Integer luckBonus;

    @Column(name = "min_dmg")
    private Integer minDmg;

    @Column(name = "max_dmg")
    private Integer maxDmg;

    @ManyToOne
    @JsonIgnoreProperties("equipment")
    private Player player;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Item name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Item imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ItemType getType() {
        return type;
    }

    public Item type(ItemType type) {
        this.type = type;
        return this;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public Boolean isEquipped() {
        return equipped;
    }

    public Item equipped(Boolean equipped) {
        this.equipped = equipped;
        return this;
    }

    public void setEquipped(Boolean equipped) {
        this.equipped = equipped;
    }

    public Integer getStrBonus() {
        return strBonus;
    }

    public Item strBonus(Integer strBonus) {
        this.strBonus = strBonus;
        return this;
    }

    public void setStrBonus(Integer strBonus) {
        this.strBonus = strBonus;
    }

    public Integer getConBonus() {
        return conBonus;
    }

    public Item conBonus(Integer conBonus) {
        this.conBonus = conBonus;
        return this;
    }

    public void setConBonus(Integer conBonus) {
        this.conBonus = conBonus;
    }

    public Integer getDexBonus() {
        return dexBonus;
    }

    public Item dexBonus(Integer dexBonus) {
        this.dexBonus = dexBonus;
        return this;
    }

    public void setDexBonus(Integer dexBonus) {
        this.dexBonus = dexBonus;
    }

    public Integer getLuckBonus() {
        return luckBonus;
    }

    public Item luckBonus(Integer luckBonus) {
        this.luckBonus = luckBonus;
        return this;
    }

    public void setLuckBonus(Integer luckBonus) {
        this.luckBonus = luckBonus;
    }

    public Integer getMinDmg() {
        return minDmg;
    }

    public Item minDmg(Integer minDmg) {
        this.minDmg = minDmg;
        return this;
    }

    public void setMinDmg(Integer minDmg) {
        this.minDmg = minDmg;
    }

    public Integer getMaxDmg() {
        return maxDmg;
    }

    public Item maxDmg(Integer maxDmg) {
        this.maxDmg = maxDmg;
        return this;
    }

    public void setMaxDmg(Integer maxDmg) {
        this.maxDmg = maxDmg;
    }

    public Player getPlayer() {
        return player;
    }

    public Item player(Player player) {
        this.player = player;
        return this;
    }

    public void setPlayer(Player player) {
        this.player = player;
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
        Item item = (Item) o;
        if (item.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), item.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Item{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", imageUrl='" + getImageUrl() + "'" +
            ", type='" + getType() + "'" +
            ", equipped='" + isEquipped() + "'" +
            ", strBonus=" + getStrBonus() +
            ", conBonus=" + getConBonus() +
            ", dexBonus=" + getDexBonus() +
            ", luckBonus=" + getLuckBonus() +
            ", minDmg=" + getMinDmg() +
            ", maxDmg=" + getMaxDmg() +
            "}";
    }
}
