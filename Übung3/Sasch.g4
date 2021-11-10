lexer grammar Sasch;

Sasch: Champion ' : ' Score ' - ' '['Items']' ' vs. ' Champion ' : ' Score ' - ' '['Items']';

fragment VS: ' vs ' ;

fragment DIVIDER: ' - ' ;

fragment BRACKETOPEN: '[' ;

fragment BRACKETCLOSE: '[' ; 

fragment COLON: ' : ' ; 

fragment SLASH: '/' ; 

fragment COMMA: ', ' ; 

fragment Champion:  'Aatrox' |
                    'Ahri' |
                    'Akali' |
                    'Akshan' |
                    'Alistar' |
                    'Amumu' |
                    'Anivia' |
                    'Annie' |
                    'Aphelios' |
                    'Ashe' |
                    'Aurelion Sol' |
                    'Azir' |
                    'Bard' |
                    'Blitzcrank' |
                    'Brand' |
                    'Braum' |
                    'Caitlyn' |
                    'Camille' |
                    'Cassiopeia' |
                    'Cho\'Gath' |
                    'Corki' |
                    'Darius' |
                    'Diana' |
                    'Dr. Mundo' |
                    'Draven' |
                    'Ekko' |
                    'Elise' |
                    'Evelynn' |
                    'Ezreal' |
                    'Fiddlesticks' |
                    'Fiora' |
                    'Fizz' |
                    'Galio' |
                    'Gangplank' |
                    'Garen' |
                    'Gnar' |
                    'Gragas' |
                    'Graves' |
                    'Gwen' |
                    'Hecarim' |
                    'Heimerdinger' |
                    'Illaoi' |
                    'Irelia' |
                    'Ivern' |
                    'Janna' |
                    'Jarvan IV' |
                    'Jax' |
                    'Jayce' |
                    'Jhin' |
                    'Jinx' |
                    'Kai\'sa' |
                    'Kalista' |
                    'Karma' |
                    'Karthus' |
                    'Kassadin' |
                    'Katarina' |
                    'Kayle' |
                    'Kayn' |
                    'Kennen' |
                    'Kha\'Zix' |
                    'Kindred' |
                    'Kled' |
                    'Kog\'Maw' |
                    'LeBlanc' |
                    'Lee Sin' |
                    'Leona' |
                    'Lillia' |
                    'Lissandra' |
                    'Lucian' |
                    'Lulu' |
                    'Lux' |
                    'Malphite' |
                    'Malzahar' |
                    'Maokai' |
                    'Master Yi' |
                    'Miss Fortune' |
                    'Mordekaiser' |
                    'Morgana' |
                    'Nami' |
                    'Nasus' |
                    'Nautilus' |
                    'Neeko' |
                    'Nidalee' |
                    'Nocturne' |
                    'Nunu & Willump' |
                    'Olaf' |
                    'Orianna' |
                    'Ornn' |
                    'Pantheon' |
                    'Poppy' |
                    'Pyke' |
                    'Qiyana' |
                    'Quinn' |
                    'Rakan' |
                    'Rammus' |
                    'Rek\'Sai' |
                    'Rell' |
                    'Renekton' |
                    'Rengar' |
                    'Riven' |
                    'Rumble' |
                    'Ryze' |
                    'Samira' |
                    'Sejuani' |
                    'Senna' |
                    'Seraphine' |
                    'Sett' |
                    'Shaco' |
                    'Shen' |
                    'Shyvana' |
                    'Singed' |
                    'Sion' |
                    'Sivir' |
                    'Skarner' |
                    'Sona' |
                    'Soraka' |
                    'Swain' |
                    'Sylas' |
                    'Syndra' |
                    'Tahm Kench' |
                    'Taliyah' |
                    'Talon' |
                    'Taric' |
                    'Teemo' |
                    'Thresh' |
                    'Tristana' |
                    'Trundle' |
                    'Tryndamere' |
                    'Twisted Fate' |
                    'Twitch' |
                    'Udyr' |
                    'Urgot' |
                    'Varus' |
                    'Vayne' |
                    'Veigar' |
                    'Vel`Koz' |
                    'Vex' |
                    'Vi' |
                    'Viego' |
                    'Viktor' |
                    'Vladimir' |
                    'Volibear' |
                    'Warwick' |
                    'Wukong' |
                    'Xayah' |
                    'Xerath' |
                    'Xin Zhao' |
                    'Yasuo' |
                    'Yone' |
                    'Yuumi' |
                    'Yorick' |
                    'Zac' |
                    'Zed' |
                    'Ziggs' |
                    'Zilean' |
                    'Zoe' |
                    'Zyra' ;

fragment Score: Kills'/'Deaths'/'Assists ;

fragment Kills: [0-9]?[0-9] ;

fragment Deaths: [0-9]?[0-9] ;

fragment Assists: [0-9]?[0-9] ;

fragment Items: Mythics ', ' Normal | Mythics | Normal | Unique ;

fragment Mythics:   'Bloodward' |
                    'Ceaseless Hunger' |
                    'Deicide' |
                    'Divine Sunderer' |
                    'Draktharr\'s Shadowcarver' |
                    'Dreamshatter' |
                    'Duskblade of Drakkthar' |
                    'Eclipse' |
                    'Eternal Winter' |
                    'Everfrost' |
                    'Eye of Luden' |
                    'Forgefire Crest' |
                    'Frostfire Gauntlet' |
                    'Galeforce' |
                    'Goredrinker' |
                    'Hextech Rocketbelt' |
                    'Icathia\'s Curse' |
                    'Immortal Shieldbow' |
                    'Imperial Mandate' |
                    'Infinity Force' |
                    'Kraken Slayer' |
                    'Liandry\'s Anguish' |
                    'Liandry\'s Lament' |
                    'Luden\'s Echo' |
                    'Locket of the Iron Solari' |
                    'Luden\'s Tempest' |
                    'Moonstone Renewer' |
                    'Night Harvester' |
                    'Prowler\'s Claw' |
                    'Reliquary of the Golden Dawn' |
                    'Rimeforged Grasp' |
                    'Riftmaker' |
                    'Sandshrike\'s Claw' |
                    'Seat of Command' |
                    'Shurelya\'s Battlesong' |
                    'Shurelya\'s Requiem' |
                    'Starcaster' |
                    'Stridebreaker' |
                    'Sunfire Aegis' |
                    'Syzygz' |
                    'Trinity Force' |
                    'Turbo Chemtank' |
                    'Turbocharged Hexperiment' |
                    'Typhoon' |
                    'Upgraded Aeropack' |
                    'Vespertide' |
                    'Wyrmfallen Sacrifice' ;

fragment Normal:    'Abyssal Mask' |
                    'Aegis of the Legion' |
                    'Aether Wisp' |
                    'Amplifying Tome' |
                    'Anathema\'s Chains' |
                    'Archangel\'s Staff' |
                    'Ardent Censer' |
                    'B. F. Sword' |
                    'Bami\'s Cinder' |
                    'Bandleglass Mirror' |
                    'Banshee\'s Veil' |
                    'Berserker\'s Greaves' |
                    'Black Cleaver' |
                    'Black Mist Scythe' |
                    'Blade of the Ruined King' |
                    'Blasting Wand' |
                    'Blighting Jewel' |
                    'Bloodthirster' |
                    'Boots' |
                    'Boots of Swiftness' |
                    'Bramble West' |
                    'Broken Stopwatch' |
                    'Bulwark of the Mountain' |
                    'Caulfield\'s Warhammer' |
                    'Chain Vest' |
                    'Chempunk Chainsword' |
                    'Chemtech Purifier' |
                    'Cloak of Agility' |
                    'Cloth Armor' |
                    'Commencing Stopwatch' |
                    'Cosmic Drive' |
                    'Crytalline Bracer' |
                    'Dagger' |
                    'Dead Man\'s Plate' |
                    'Death\'s Dance' |
                    'Demonic Embrace' |
                    'Doran\'s Blade' |
                    'Doran\'s Ring' |
                    'Doran\'s Shield' |
                    'Edge of Night' |
                    'Elixir of Iron' |
                    'Elixir of Sorcery' |
                    'Elixir of Wrath' |
                    'Essence Reaver' |
                    'Executioner\'s Calling' |
                    'Faerie Charm' |
                    'Fiendish Codex' |
                    'Forbidden Idol' |
                    'Force of Nature' |
                    'Frozen Heart' |
                    'Gargoyle Stoneplate' |
                    'Giant\'s Belt' |
                    'Glacial Buckler' |
                    'Guardian Angel' |
                    'Guardian\'s Blade' |
                    'Guardian\'s Hammer' |
                    'Guardian\'s Horn' |
                    'Guardian\'s Orb' |
                    'Guinsoo\'s Rageblade' |
                    'Hearthbound Axe' |
                    'Hexdrinker' |
                    'Hextech Alternator' |
                    'Horizon Focus' |
                    'Hullbreaker' |
                    'Infinity Edge' |
                    'Ionian Boot\'s of Lucidity' |
                    'Ironspike Whip' |
                    'Kindlegem' |
                    'Kircheis Shadowcarver' |
                    'Knight\'s Vow' |
                    'Last Whisper' |
                    'Leeching Leer' |
                    'Lich Bane' |
                    'Long Sword' |
                    'Lord Dominik\'s Regards' |
                    'Lost Chapter' |
                    'Maw of Malmortius' |
                    'Mercurial Scimitar' |
                    'Mercury\'s Treads' |
                    'Mikael\'s Blessing' |
                    'Mobility Boots' |
                    'Morellonomicon' |
                    'Mortal Reminder' |
                    'Muramana' |
                    'Nashor\'s Tooth' |
                    'Navori Quickblades' |
                    'Needlessly Large Rod' |
                    'Negatron Cloak' |
                    'Noonquiver' |
                    'Null-Magic Mantle' |
                    'Oblivion Orb' |
                    'Phage' |
                    'Phantom Dancer' |
                    'Pickaxe' |
                    'Plated Steelcaps' |
                    'Quicksilver Sash' |
                    'Rabadon\'s Deathcap' |
                    'Rageknife' |
                    'Randuin\'s Omen' |
                    'Rapid Firecannon' |
                    'Ravenous Hydra' |
                    'Recurve Bow' |
                    'Redemption' |
                    'Rejuvenation Bead' |
                    'Relic Shield' |
                    'Ruby Crystal' |
                    'Runaan\'s Hurricane' |
                    'Rylai\'s Crystal Scepter' |
                    'Sapphire Crystal' |
                    'Seeker\'s Armguard' |
                    'Seraph\'s Embrace' |
                    'Serpent\'s Fang' |
                    'Serrated Dirk' |
                    'Serylda\'s Grudge' |
                    'Sheen' |
                    'Silvermere Dawn' |
                    'Sorcerer\'s Shoes' |
                    'Spectral Sickle' |
                    'Spectre\'s Cowl' |
                    'Spellthief\'s Edge' |
                    'Spirit Visage' |
                    'Staff of Flowing Water' |
                    'Steel Shoulderguards' |
                    'Sterak\'s Gage' |
                    'Stopwatch' |
                    'Stormrazor' |
                    'The Collector' |
                    'Thornmail' |
                    'Tiamat' |
                    'Titanic Hydra' |
                    'Umbral Glaive' |
                    'Vampiric Scepter' |
                    'Verdant Barrier' |
                    'Void Staff' |
                    'Warden\'s Mail' |
                    'Warmog\'s Armor' |
                    'Winged Moonplate' |
                    'Wit\'s End' |
                    'Youmuu\'s Ghostblade' |
                    'Zeal' |
                    'Zeke\'s Convergence' |
                    'Zhonya\'s Hourglass'  ;

fragment Unique:    'Black Spear' |
                    'Death\'s Daugther' | 'Fire At Will' | 'Raise Morale' |
                    'Scarecrow Effigy' | 
                    'Slightly Magical Boots' |
                    'Your Cut' ;

WS: [ \t\r\n]+ -> channel(HIDDEN);