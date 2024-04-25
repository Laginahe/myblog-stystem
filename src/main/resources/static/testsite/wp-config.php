<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the installation.
 * You don't have to use the web site, you can copy this file to "wp-config.php"
 * and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * Database settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://wordpress.org/documentation/article/editing-wp-config-php/
 *
 * @package WordPress
 */

// ** Database settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'wordpress' );

/** Database username */
define( 'DB_USER', 'root' );

/** Database password */
define( 'DB_PASSWORD', 'wbf' );

/** Database hostname */
define( 'DB_HOST', 'localhost' );

/** Database charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The database collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication unique keys and salts.
 *
 * Change these to different unique phrases! You can generate these using
 * the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}.
 *
 * You can change these at any point in time to invalidate all existing cookies.
 * This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         '*Hz#IL!7)4F_{f/39s5ZgAwU%S7Z|Wc*9u:aS!j#,~KnP,[-7C<KgUtBJqiA,E]S' );
define( 'SECURE_AUTH_KEY',  '>oqvZoMgaB/lPUcYTY9Asc1u {LYX4&M*u}IVm5{t04[]`Kk81_s1dz$MSSJmQpb' );
define( 'LOGGED_IN_KEY',    '3K)rvL_*%9Zq?1 x3.s,7T46Z}_`>_$W2`t8YQN0NP*d%_)TDbZQ>.ibwl96}MC@' );
define( 'NONCE_KEY',        '{G>HK/|`XF0!ihQA#v-}OqE:02>^X$gSdn#0/KXX}Nmc~YAUK|6F/|zj0g>1Ce@?' );
define( 'AUTH_SALT',        ',B2}`GQYLMaD)= =1cGRHO7DIEkayuO0y?A8UI?/:CZ2):+LmEGI `g4tK|r_!_+' );
define( 'SECURE_AUTH_SALT', '*eokmCBR.{H+y(w{!;xpo,O[#UOv?}g%=I*Z.%nhOPC%jE)FR._Up)y>{J[ qVlY' );
define( 'LOGGED_IN_SALT',   '(rCpOC3*[R:q$;`]pE6G16whqKRp3s^@T8H27?r3v($X09qjs*lGzwu T_WmG83[' );
define( 'NONCE_SALT',       '8PBw]8@w$xPoVIkKqZfc]?!6-.#+7<LNf;C+w ~6n(>;P0?4x=Gj8S)U,qzY#)p>' );

/**#@-*/

/**
 * WordPress database table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://wordpress.org/documentation/article/debugging-in-wordpress/
 */
define( 'WP_DEBUG', false );

/* Add any custom values between this line and the "stop editing" line. */



/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
