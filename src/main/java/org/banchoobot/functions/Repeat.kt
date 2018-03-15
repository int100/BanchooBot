package org.banchoobot.functions

import org.banchoobot.frame.deserializer.events.Message
import org.banchoobot.functions.annotations.AllowedMethods
import org.banchoobot.functions.annotations.MessageFunction
import org.banchoobot.functions.interfaces.IMessageFunction

/**
 * 复读机天下无敌
 */
@MessageFunction(allowedMethods = [AllowedMethods.PRIVATE], disabled = true)
class Repeat : IMessageFunction {
    override fun onMessage(event: Message) {
        event.reply(event.message)
    }
}
