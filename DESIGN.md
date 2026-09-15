# Autka Design

## Overview

Autka is a car-shopping and import-cost companion. Its UI should feel like a useful roadbook: fast to scan, calm around photos and maps, and precise around prices, mileage, tax and shipping figures. The visual reference is modern automotive instrumentation without dashboard cosplay.

The Android runtime theme remains the canonical token source. This file documents the intent behind `app/src/main/java/com/autka/ui/theme/` and must change with it when durable visual decisions change.

**North Star:** readable vehicle data and obvious actions during one-handed phone use.

**Avoid:** fake carbon fibre, neon racing palettes, excessive shadows, card-inside-card layouts, decorative animation, and controls that compete with listing photos or maps.

## Colors

Light semantic roles:

- primary / road blue: `#1E5A96`
- primary container: `#D7E9FF`
- attention / amber: `#8A4F00`
- amber container: `#F4D9B3`
- background / canvas: `#F5F7FA`
- surface: `#FFFFFF`
- muted surface: `#E9EEF4`
- foreground / asphalt: `#171A1F`
- muted foreground: `#5D6672`
- border: `#D2D9E2`

Dark mode keeps the same semantic hierarchy rather than inverting values. Background is `#111418`, surface `#191D22`, and muted surface `#242A31`. Brand and attention hues become lighter for contrast.

Blue is for primary actions and navigation. Amber is reserved for meaningful attention, cost emphasis or warning-adjacent states, not decoration. Error/success colors continue to use Material semantic roles.

## Typography

Use the Android system font stack. Vehicle facts should scan quickly and remain stable across locales.

- headline: 28–32sp, bold
- title: 16–22sp, semibold
- body: 14–16sp, regular
- labels/actions: 14sp, semibold

Numeric values should prefer alignment and hierarchy over novelty. Do not introduce a bundled display font unless it improves actual data readability enough to justify APK and rendering cost.

## Layout

Phone-first and thumb-aware. Give content breathing room at the top, keep frequent actions within easy reach, and use collapsing app bars or bottom sheets where they reduce travel without hiding information.

Lists should prioritize image, price, vehicle identity and the few most decision-relevant facts. Detail screens can reveal secondary facts progressively. Map surfaces stay visually quiet so markers and geography remain dominant.

Adaptive layouts may add side-by-side list/detail or navigation rail behavior when screen width earns it. Do not duplicate mobile and tablet screens solely for styling.

## Elevation & Depth

Prefer tonal separation and borders. Static content is flat by default. Reserve visible elevation for transient or floating surfaces such as sheets, menus and a genuinely floating primary action.

## Shapes

Runtime shape scale:

- extra small: 8dp
- small: 10dp
- medium: 16dp
- large: 24dp
- extra large: 28dp

Rounded corners should soften dense data without turning every row into a pill. Full pills are for chips and compact state controls only.

## Components

Shared Material 3 components are canonical. Extend them through the app theme before creating screen-local visual clones.

- Top app bars: concise on utility/detail screens; larger collapsing titles are appropriate for top-level browsing screens.
- Cards/list rows: one semantic surface per item; avoid nested cards.
- Filters: chips for quick toggles, sheets or dedicated surfaces for complex filtering.
- Buttons: primary blue for the main action; neutral/outlined for secondary actions; destructive actions keep Material danger semantics.
- Images/maps: content leads; chrome should recede.

## Do's and Don'ts

Do keep hierarchy obvious, preserve dark-mode contrast, use native Material behavior, and verify narrow/landscape layouts.

Do not add animation or third-party UI libraries without a concrete interaction need. Do not spend frame time on blur, parallax or decorative gradients. Performance and decision clarity outrank visual novelty.
