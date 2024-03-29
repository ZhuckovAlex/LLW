package net.sanberdir_rezolv.llw.init.sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir_rezolv.llw.LLW;

public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LLW.MODID);
    // Не трогать!
    public static final RegistryObject<SoundEvent> DOWSING_ROD_FOUND_ORE =
            registerSoundEvent("dowsing_rod_found_ore");
    // Звуки первоогня
    public static RegistryObject<SoundEvent> PRIMORDIAL_FIRE_BREAK = registerSoundEvent("primordial_fire_break");
    public static RegistryObject<SoundEvent> PRIMORDIAL_FIRE_STEP = registerSoundEvent("primordial_fire_step");
    public static RegistryObject<SoundEvent> PRIMORDIAL_FIRE_PLACE = registerSoundEvent("primordial_fire_place");
    public static RegistryObject<SoundEvent> PRIMORDIAL_FIRE_HIT = registerSoundEvent("primordial_fire_hit");
    public static RegistryObject<SoundEvent> PRIMORDIAL_FIRE_FALL = registerSoundEvent("primordial_fire_fall");

    // Пластинка - зов предков
    public static RegistryObject<SoundEvent> DISC_THE_CALL_OF_THE_ANCESTORS = registerSoundEvent("disc_the_call_of_the_ancestors");
    // Пластинка - шёпот древних камней
    public static RegistryObject<SoundEvent> DISC_THE_WHISPER_OF_ANCIENT_STONES = registerSoundEvent("disc_the_whisper_of_ancient_stones");

    // Регистрация звуков первооня
    public static final ForgeSoundType PRIMORDIAL_FIRE_SOUNDS = new ForgeSoundType(1f, 1.25f,
            InitSounds.PRIMORDIAL_FIRE_BREAK, InitSounds.PRIMORDIAL_FIRE_STEP, InitSounds.PRIMORDIAL_FIRE_PLACE,
            InitSounds.PRIMORDIAL_FIRE_HIT, InitSounds.PRIMORDIAL_FIRE_FALL);


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(LLW.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
