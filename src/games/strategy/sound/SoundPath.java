package games.strategy.sound;

import java.util.ArrayList;
import java.util.HashSet;

import games.strategy.engine.data.properties.IEditableProperty;

/**
 * Contains the sound file names and the directory of all sound files.
 */
public class SoundPath {
  // the sounds directory is based on the resource loader, because it could change based on the map or skin
  public static enum SoundType {
    GENERAL, TRIPLEA
  }
  // MAKE SURE TO ADD NEW SOUNDS TO THE getAllSoundOptions() METHOD! (or else the user's preference will not be saved)

  // standard sounds (files can be found in corresponding data/... folder to this package)
  public static final String CLIP_CHAT_MESSAGE = "chat_message";
  public static final String CLIP_CHAT_SLAP = "chat_slap";
  public static final String CLIP_CHAT_JOIN_GAME = "chat_join_game";
  // TODO
  public static final String CLIP_CLICK_BUTTON = "click_button";
  // TODO
  public static final String CLIP_CLICK_PLOT = "click_plot";
  public static final String CLIP_GAME_START = "game_start";
  public static final String CLIP_GAME_WON = "game_won";
  // TODO
  public static final String CLIP_REQUIRED_ACTION = "required_action";
  public static final String CLIP_REQUIRED_YOUR_TURN_SERIES = "required_your_turn_series";
  // TripleA sounds:
  // custom AA Guns:
  public static final String CLIP_BATTLE_X_PREFIX = "battle_";
  public static final String CLIP_BATTLE_X_HIT = "_hit";
  public static final String CLIP_BATTLE_X_MISS = "_miss";
  // custom triggered notification sounds:
  public static final String CLIP_TRIGGERED_NOTIFICATION_SOUND = "notification_";
  public static final String CLIP_TRIGGERED_DEFEAT_SOUND = "defeat_";
  public static final String CLIP_TRIGGERED_VICTORY_SOUND = "victory_";
  // normal sounds:
  public static final String CLIP_BATTLE_AA_HIT = "battle_aa_hit";
  public static final String CLIP_BATTLE_AA_MISS = "battle_aa_miss";
  public static final String CLIP_BATTLE_AIR = "battle_air";
  public static final String CLIP_BATTLE_AIR_SUCCESSFUL = "battle_air_successful";
  public static final String CLIP_BATTLE_BOMBARD = "battle_bombard";
  public static final String CLIP_BATTLE_FAILURE = "battle_failure";
  public static final String CLIP_BATTLE_LAND = "battle_land";
  public static final String CLIP_BATTLE_RETREAT_AIR = "battle_retreat_air";
  public static final String CLIP_BATTLE_RETREAT_LAND = "battle_retreat_land";
  public static final String CLIP_BATTLE_RETREAT_SEA = "battle_retreat_sea";
  public static final String CLIP_BATTLE_RETREAT_SUBMERGE = "battle_retreat_submerge";
  public static final String CLIP_BATTLE_SEA_NORMAL = "battle_sea_normal";
  public static final String CLIP_BATTLE_SEA_SUBS = "battle_sea_subs";
  public static final String CLIP_BATTLE_SEA_SUCCESSFUL = "battle_sea_successful";
  public static final String CLIP_BATTLE_STALEMATE = "battle_stalemate";
  public static final String CLIP_BOMBING_ROCKET = "bombing_rocket";
  public static final String CLIP_BOMBING_STRATEGIC = "bombing_strategic";
  public static final String CLIP_PHASE_BATTLE = "phase_battle";
  public static final String CLIP_PHASE_END_TURN = "phase_end_turn";
  public static final String CLIP_PHASE_MOVE_COMBAT = "phase_move_combat";
  public static final String CLIP_PHASE_MOVE_NONCOMBAT = "phase_move_noncombat";
  public static final String CLIP_PHASE_PLACEMENT = "phase_placement";
  public static final String CLIP_PHASE_POLITICS = "phase_politics";
  public static final String CLIP_PHASE_PURCHASE = "phase_purchase";
  public static final String CLIP_PHASE_TECHNOLOGY = "phase_technology";
  public static final String CLIP_PHASE_USER_ACTIONS = "phase_user_actions";
  public static final String CLIP_PLACED_AIR = "placed_air";
  public static final String CLIP_PLACED_INFRASTRUCTURE = "placed_infrastructure";
  public static final String CLIP_PLACED_LAND = "placed_land";
  public static final String CLIP_PLACED_SEA = "placed_sea";
  public static final String CLIP_POLITICAL_ACTION_FAILURE = "political_action_failure";
  public static final String CLIP_POLITICAL_ACTION_SUCCESSFUL = "political_action_successful";
  public static final String CLIP_TECHNOLOGY_FAILURE = "technology_failure";
  public static final String CLIP_TECHNOLOGY_SUCCESSFUL = "technology_successful";
  public static final String CLIP_TERRITORY_CAPTURE_BLITZ = "territory_capture_blitz";
  public static final String CLIP_TERRITORY_CAPTURE_CAPITAL = "territory_capture_capital";
  public static final String CLIP_TERRITORY_CAPTURE_LAND = "territory_capture_land";
  public static final String CLIP_TERRITORY_CAPTURE_SEA = "territory_capture_sea";
  public static final String CLIP_USER_ACTION_FAILURE = "user_action_failure";
  public static final String CLIP_USER_ACTION_SUCCESSFUL = "user_action_successful";

  public static HashSet<String> getAllSoundOptions() {
    final HashSet<String> rVal = new HashSet<String>();
    rVal.add(CLIP_CHAT_MESSAGE);
    rVal.add(CLIP_CHAT_SLAP);
    rVal.add(CLIP_CHAT_JOIN_GAME);
    rVal.add(CLIP_CLICK_BUTTON);
    rVal.add(CLIP_CLICK_PLOT);
    rVal.add(CLIP_GAME_START);
    rVal.add(CLIP_GAME_WON);
    rVal.add(CLIP_REQUIRED_ACTION);
    rVal.add(CLIP_REQUIRED_YOUR_TURN_SERIES);
    rVal.add(CLIP_BATTLE_AA_HIT);
    rVal.add(CLIP_BATTLE_AA_MISS);
    rVal.add(CLIP_BATTLE_AIR);
    rVal.add(CLIP_BATTLE_AIR_SUCCESSFUL);
    rVal.add(CLIP_BATTLE_BOMBARD);
    rVal.add(CLIP_BATTLE_FAILURE);
    rVal.add(CLIP_BATTLE_LAND);
    rVal.add(CLIP_BATTLE_RETREAT_AIR);
    rVal.add(CLIP_BATTLE_RETREAT_LAND);
    rVal.add(CLIP_BATTLE_RETREAT_SEA);
    rVal.add(CLIP_BATTLE_RETREAT_SUBMERGE);
    rVal.add(CLIP_BATTLE_SEA_NORMAL);
    rVal.add(CLIP_BATTLE_SEA_SUBS);
    rVal.add(CLIP_BATTLE_SEA_SUCCESSFUL);
    rVal.add(CLIP_BATTLE_STALEMATE);
    rVal.add(CLIP_BOMBING_ROCKET);
    rVal.add(CLIP_BOMBING_STRATEGIC);
    rVal.add(CLIP_PHASE_BATTLE);
    rVal.add(CLIP_PHASE_END_TURN);
    rVal.add(CLIP_PHASE_MOVE_COMBAT);
    rVal.add(CLIP_PHASE_MOVE_NONCOMBAT);
    rVal.add(CLIP_PHASE_PLACEMENT);
    rVal.add(CLIP_PHASE_POLITICS);
    rVal.add(CLIP_PHASE_PURCHASE);
    rVal.add(CLIP_PHASE_TECHNOLOGY);
    rVal.add(CLIP_PHASE_USER_ACTIONS);
    rVal.add(CLIP_PLACED_AIR);
    rVal.add(CLIP_PLACED_INFRASTRUCTURE);
    rVal.add(CLIP_PLACED_LAND);
    rVal.add(CLIP_PLACED_SEA);
    rVal.add(CLIP_POLITICAL_ACTION_FAILURE);
    rVal.add(CLIP_POLITICAL_ACTION_SUCCESSFUL);
    rVal.add(CLIP_TECHNOLOGY_FAILURE);
    rVal.add(CLIP_TECHNOLOGY_SUCCESSFUL);
    rVal.add(CLIP_TERRITORY_CAPTURE_BLITZ);
    rVal.add(CLIP_TERRITORY_CAPTURE_CAPITAL);
    rVal.add(CLIP_TERRITORY_CAPTURE_LAND);
    rVal.add(CLIP_TERRITORY_CAPTURE_SEA);
    rVal.add(CLIP_USER_ACTION_FAILURE);
    rVal.add(CLIP_USER_ACTION_SUCCESSFUL);
    return rVal;
  }


  public static ArrayList<IEditableProperty> getSoundOptions(final SoundType sounds) {
    final ArrayList<IEditableProperty> rVal = new ArrayList<IEditableProperty>();
    rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_CHAT_MESSAGE, "Chat Messaging"));
    rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_CHAT_SLAP, "Chat Slapping"));
    rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_CHAT_JOIN_GAME, "Joined Chat"));
    rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_CLICK_BUTTON, "Click Button"));
    rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_CLICK_PLOT, "Click Plot"));
    rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_GAME_START, "Game Start"));
    rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_GAME_WON, "Game Won"));
    rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_REQUIRED_ACTION, "Required Action"));
    rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_REQUIRED_YOUR_TURN_SERIES, "Start of Your Turn Control"));
    switch (sounds) {
      case TRIPLEA:
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_AA_HIT, "AA Hit"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_AA_MISS, "AA Miss"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_AIR, "Air Battle"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_AIR_SUCCESSFUL, "Air Battle Won"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_BOMBARD, "Bombardment"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_FAILURE, "Battle Lost"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_LAND, "Land Battle"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_RETREAT_AIR, "Air Retreat"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_RETREAT_LAND, "Land Retreat"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_RETREAT_SEA, "Sea Retreat"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_RETREAT_SUBMERGE, "Sub Submerge"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_SEA_NORMAL, "Naval Battle"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_SEA_SUBS, "Submarine Battle"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_SEA_SUCCESSFUL, "Sea Battle Won"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BATTLE_STALEMATE, "Battle Stalemate"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BOMBING_ROCKET, "Rocket Attack"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_BOMBING_STRATEGIC, "Strategic Bombing"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PHASE_BATTLE, "Phase: Battle"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PHASE_END_TURN, "Phase: End Turn"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PHASE_MOVE_COMBAT, "Phase: Combat Movement"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PHASE_MOVE_NONCOMBAT, "Phase: NonCombat Movement"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PHASE_PLACEMENT, "Phase: Placement"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PHASE_POLITICS, "Phase: Politics"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PHASE_PURCHASE, "Phase: Purchase Phase"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PHASE_TECHNOLOGY, "Phase: Technology"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PHASE_USER_ACTIONS, "Phase: User Actions"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PLACED_AIR, "Place Air Units"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PLACED_INFRASTRUCTURE, "Place Infrastructure"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PLACED_LAND, "Place Land Units"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_PLACED_SEA, "Place Sea Units"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_POLITICAL_ACTION_FAILURE, "Political Action Failed"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_POLITICAL_ACTION_SUCCESSFUL, "Political Action Successful"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_TECHNOLOGY_FAILURE, "Technology Failed"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_TECHNOLOGY_SUCCESSFUL, "Technology Researched"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_TERRITORY_CAPTURE_BLITZ, "Captured By Blitzing"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_TERRITORY_CAPTURE_CAPITAL, "Captured Capital"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_TERRITORY_CAPTURE_LAND, "Captured Land Territory"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_TERRITORY_CAPTURE_SEA, "Captured Sea Zone"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_TRIGGERED_NOTIFICATION_SOUND, "Triggered Notification Sound"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_TRIGGERED_DEFEAT_SOUND, "Triggered Defeat Sound"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_TRIGGERED_VICTORY_SOUND, "Triggered Victory Sound"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_USER_ACTION_FAILURE, "Action Operation Failed"));
        rVal.add(new SoundOptionCheckBox(SoundPath.CLIP_USER_ACTION_SUCCESSFUL, "Action Operation Successful"));
        break;
      default:
        break;
    }
    return rVal;
  }
}
