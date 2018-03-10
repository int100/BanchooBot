package org.banchoobot.functions.annotations

/**
 * 消息功能
 */
@Target(AnnotationTarget.CLASS)
annotation class MessageFunction (
        val allowedMethods: Array<AllowedMethods> = [(AllowedMethods.PRIVATE), (AllowedMethods.GROUP), (AllowedMethods.DISCUSS)]
)